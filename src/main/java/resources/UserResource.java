package resources;

import entity.User;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import services.UserService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/rest/user")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserResource extends PanacheEntity {
    @Inject
    UserService userService;

    @Inject
    private ObjectMapper mapper;

    @GET
    public Response get() throws JsonProcessingException {
        List<User> users = userService.get();
        return Response.ok(mapper.writeValueAsString(users)).build();
    }

    @GET
    @Path("/{email}")
    public User search(@PathParam("email") String email) {
        return User.findByEmail(email);
    }

    @POST
    public Response create(User user) {
        if (userService.create(user)) {
            return Response.status(201).build();
        }
        return Response.status(404).build();
    }

    @PUT
    @Path("/{id}")
    public Response update(@PathParam("id") Long id, User user) {
        userService.update(id, user);
        return Response.status(200).build();
    }

    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") Long id) {
        return (userService.delete(id)) ? Response.noContent().build() : Response.status(404).build();
    }
}

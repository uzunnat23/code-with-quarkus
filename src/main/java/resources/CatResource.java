package resources;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import entity.Cat;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import services.CatService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/cats")

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CatResource extends PanacheEntity {
    @Inject
    CatService catService;
    @Inject
    private ObjectMapper mapper;

    @GET
    public Response get() throws JsonProcessingException {
        List<Cat> cats = catService.get();
        return Response.ok(mapper.writeValueAsString(cats)).build();
    }

    @POST
    public Response create(Cat cat) {
        if (catService.create(cat)) {
            return Response.status(201).build();
        }
        return Response.status(404).build();
    }

    @PUT
    @Path("/{id}")
    public Response update(@PathParam("id") Long id, Cat cat) {
        catService.update(id, cat);
        return Response.status(200).build();
    }

    @DELETE
    @Path("{id}")
    public Response delete(@PathParam("id") Long id) {
        return (catService.delete(id)) ? Response.noContent().build() : Response.status(404).build();
    }
}

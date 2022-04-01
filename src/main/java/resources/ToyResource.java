package resources;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import entity.Toy;
import services.ToyService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/toys")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ToyResource {
    @Inject
    ToyService toyService;
    @Inject
    private ObjectMapper mapper;

    @GET
    public Response get() throws JsonProcessingException {
        List<Toy> toys = toyService.get();
        return Response.ok(mapper.writeValueAsString(toys)).build();
    }

    @POST
    public Response create(Toy toy) {
        if (toyService.create(toy)) {
            return Response.status(201).build();
        }
        return Response.status(404).build();
    }

    @PUT
    @Path("/{id}")
    public Response update(@PathParam("id") Long id, Toy toy) {
        toyService.update(id, toy);
        return Response.status(200).build();
    }

    @DELETE
    @Path("{id}")
    public Response delete(@PathParam("id") Long id) {
        return (toyService.delete(id)) ? Response.noContent().build() : Response.status(404).build();
    }
}

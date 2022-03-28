package resources;

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

    @GET
    public Response get() {
        List<Toy> owners = toyService.get();
        return Response.ok(owners).build();
    }

    @POST
    public void create(Toy toy) {
        toyService.create(toy);
    }

    @PUT
    public void update(Toy toy) {
        toyService.update(toy);
    }

    @DELETE
    @Path("{id}")
    public void delete(@PathParam("id") Long id) {
        toyService.delete(id);
    }
}

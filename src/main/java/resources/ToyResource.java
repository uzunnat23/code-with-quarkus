package resources;

import entity.Toy;
import services.ToyService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/toys")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ToyResource {
    @Inject
    ToyService toyService;

    @GET
    public List<Toy> get() {
        return toyService.get();
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

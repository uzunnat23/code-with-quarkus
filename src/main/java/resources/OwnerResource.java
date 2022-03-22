package resources;

import entity.Owner;
import services.OwnerService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/owners")

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class OwnerResource {
    @Inject
    OwnerService ownerService;

    @GET
    public List<Owner> get() {
        return ownerService.get();
    }

    @POST
    public void create(Owner owner) {
        ownerService.create(owner);
    }


    @PUT
    public void update(Owner owner) {
        ownerService.update(owner);
    }

    @DELETE
    @Path("{id}")
    public void delete(@PathParam("id") Long id) {
        ownerService.delete(id);
    }

}




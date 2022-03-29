package resources;

import entity.Owner;
import services.OwnerService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/owners")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class OwnerResource {

    @Inject
    OwnerService ownerService;

    @GET
    public Response get() {
        List<Owner> owners = ownerService.get();
        return Response.ok(owners).build();
    }

    @POST
    public Response create(Owner owner) {
        if (ownerService.create(owner)) {
            return Response.status(201).build();
        }
        return Response.status(404).build();
    }

    @PUT
    @Path("/{id}")
    public Response update(@PathParam("id") Long id, Owner owner) {
        ownerService.update(id, owner);
        return Response.status(200).build();
    }

    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") Long id) {
        return (ownerService.delete(id)) ? Response.noContent().build()
                                            : Response.status(404).build();
    }

}




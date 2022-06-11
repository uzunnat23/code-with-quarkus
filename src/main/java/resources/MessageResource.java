package resources;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import entity.Message;
import services.MessageService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/rest/message")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MessageResource {
    @Inject
    MessageService messageService;

    @Inject
    private ObjectMapper mapper;

    @GET
    public Response get() throws JsonProcessingException {
        List<Message> messages = messageService.get();
        return Response.ok(mapper.writeValueAsString(messages)).build();
    }


    @POST
    public Response create(Message message) {
        if (messageService.create(message)) {
            return Response.status(201).build();
        }
        return Response.status(404).build();
    }

    @PUT
    @Path("/{id}")
    public Response update(@PathParam("id") Long id, Message message) {
        messageService.update(id, message);
        return Response.status(200).build();
    }

    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") Long id) {
        return (messageService.delete(id)) ? Response.noContent().build() : Response.status(404).build();
    }
}

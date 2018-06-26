package com.wesleyegberto.restassuredtest.messages.boundary;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("messages")
public class MessagesResource {
    @GET
    public JsonObject get() {
        return Json.createObjectBuilder()
    		.add("message", "Hello Rest Assured!")
    		.build();
    }
}

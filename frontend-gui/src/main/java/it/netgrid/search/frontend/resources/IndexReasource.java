package it.netgrid.search.frontend.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

import io.codearte.jfairy.Fairy;
import it.netgrid.search.model.Response;


@Path("/index")
public class IndexReasource {
	
	private Fairy fairy = Fairy.create();
	

	@GET
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Response getResponse(@Context HttpHeaders headers, @QueryParam("query") String Query){
		Response result = new Response();
		int count = fairy.baseProducer().randomBetween(10, 15);
		String content = fairy.textProducer().sentence();
		String id = fairy.textProducer().randomString(10);
		
		return result;
	}
}

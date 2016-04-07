package it.netgrid.search.frontend.resources;

import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

import com.j256.ormlite.dao.ForeignCollection;

import io.codearte.jfairy.Fairy;
import it.netgrid.search.model.Response;
import it.netgrid.search.model.ResponseItem;


@Path("/index")
public class IndexReasource {
	
	private Fairy fairy = Fairy.create();
	

	@GET
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Response getResponse(@Context HttpHeaders headers, @QueryParam("query") String query){
		ForeignCollection<ResponseItem> risultati = new ForeignCollection<ResponseItem>();
		ResponseItem item;
		
		//variabili per result
		int count = fairy.baseProducer().randomBetween(10, 15);
		String content = fairy.textProducer().sentence();
		String id = fairy.textProducer().randomString(10);
		double queryti = fairy.baseProducer().randomBetween(1000, 3000);
		
		//variabili per responseItem
		String url;
		String title;
		String bodyPatch;
		Date date;
		
		
		//inizializza l'item e lo aggiunge alla collezione
		for(int i=0; i<count; i++){
			item= new ResponseItem();
			
			
			
			risultati.add(item);
		}
		
		
		
		
		Response result = new Response(id, query, queryti, count);
		result.setItems(risultati);
		return result;
	}
}

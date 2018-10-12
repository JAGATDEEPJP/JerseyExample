package com.mkyong.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.mkyong.QuadraticEquation;
import com.mkyong.FindQuadraticRoots;

@Path("/json")
public class JSONService
{

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public QuadraticEquation getSampleQEInJSON()
	{

		QuadraticEquation qe = new QuadraticEquation();
		qe.setA(6);
		qe.setB(4);
		qe.setC(2);

		return qe;

	}

	@POST
	@Path("/create")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createQE(QuadraticEquation qe)
	{
		String result = qe.toString();
		return Response.status(201).entity(result).build();
	}

	@POST
	@Path("/find_roots")
	@Consumes(MediaType.APPLICATION_JSON)
	public FindQuadraticRoots findRootsQE(QuadraticEquation qe)
	{
		FindQuadraticRoots roots = new FindQuadraticRoots(qe.getA(), qe.getB(), qe.getC());
		return roots;
	}

}
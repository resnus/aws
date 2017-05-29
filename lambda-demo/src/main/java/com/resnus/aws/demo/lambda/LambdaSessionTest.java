package com.resnus.aws.demo.lambda;


import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.resnus.aws.demo.lambda.entity.Request;
import com.resnus.aws.demo.lambda.entity.Response;

/**
 * Created by resnus on 5/29/2017.
 */
public class LambdaSessionTest implements RequestHandler<Request,Response> {

    private static int staticVal = 0;
    private int instanceVal = 0;

    @Override
    public Response handleRequest(Request request, Context context) {
        context.getLogger().log("Static: " + staticVal++ + "\n");
        context.getLogger().log("Instance: " + instanceVal++ + "\n");

        context.getLogger().log(request.toString() + "\n");

        Response response = new Response(request.getId() + " = " + request.getValue());

        context.getLogger().log(response.toString() + "\n");
        return response;
    }
}

package com.resnus.aws.demo.lambda;


import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.resnus.aws.demo.lambda.entity.Request;
import com.resnus.aws.demo.lambda.entity.Response;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Created by resnus on 5/29/2017.
 */
public class LambdaSessionTest implements RequestHandler<Request,Response> {

    private static int staticVal = 0;
    private int instanceVal = 0;

    private static final Logger log = LogManager.getLogger(LambdaSessionTest.class);

    private static final String LOG_LEVEL = System.getProperty("LOG_LEVEL");

    @Override
    public Response handleRequest(Request request, Context context) {
        //context.getLogger().log("Static: " + staticVal++ + "\n");
        //context.getLogger().log("Instance: " + instanceVal++ + "\n");
        log.error("Log Level: " + log.getEffectiveLevel() + " LOG_LEVEL: " + LOG_LEVEL);

        log.debug("Static: " + staticVal++ + " instance: " +instanceVal++);
        //context.getLogger().log(request.toString() + "\n");

        log.info(request);
        Response response = new Response(request.getId() + " = " + request.getValue());

        //context.getLogger().log(response.toString() + "\n");
        log.info(response);
        return response;
    }
}

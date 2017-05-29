package com.resnus.aws.lambda.test;

import com.amazonaws.services.lambda.runtime.ClientContext;
import com.amazonaws.services.lambda.runtime.CognitoIdentity;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.resnus.aws.demo.lambda.LambdaSessionTest;
import com.resnus.aws.demo.lambda.entity.Request;
import org.junit.Test;

/**
 * Created by resnus on 5/29/2017.
 */
public class LambdaSession {

    @Test
    public void test(){
        LambdaSessionTest lambda = new LambdaSessionTest();
        Request r = new Request();
        r.setId(1);
        r.setValue("Some value");
        lambda.handleRequest(r, context);
    }

    static Context context = new Context() {
        @Override
        public String getAwsRequestId() {
            return null;
        }

        @Override
        public String getLogGroupName() {
            return null;
        }

        @Override
        public String getLogStreamName() {
            return null;
        }

        @Override
        public String getFunctionName() {
            return null;
        }

        @Override
        public String getFunctionVersion() {
            return null;
        }

        @Override
        public String getInvokedFunctionArn() {
            return null;
        }

        @Override
        public CognitoIdentity getIdentity() {
            return null;
        }

        @Override
        public ClientContext getClientContext() {
            return null;
        }

        @Override
        public int getRemainingTimeInMillis() {
            return 0;
        }

        @Override
        public int getMemoryLimitInMB() {
            return 0;
        }

        @Override
        public LambdaLogger getLogger() {
            return null;
        }
    };
}

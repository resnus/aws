package com.resnus.aws.s3.demo;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.Bucket;

import java.util.List;

/**
 * Created by resnus on 5/29/2017.
 */
public class S3Reader {
    public static void main(String[] args) {
        AmazonS3 client =  AmazonS3ClientBuilder.defaultClient();
        List<Bucket> list = client.listBuckets();
        list.forEach(System.out::println);
    }
}

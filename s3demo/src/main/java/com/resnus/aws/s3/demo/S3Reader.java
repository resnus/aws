package com.resnus.aws.s3.demo;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.ProfileCredentialsProvider;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.Bucket;
import software.amazon.awssdk.services.s3.model.ListBucketsRequest;
import software.amazon.awssdk.services.s3.model.ListBucketsResponse;

import java.util.List;

/**
 * Created by resnus on 5/29/2017.
 */
public class S3Reader {
    public static void main(String[] args) {
        final S3Client s3Client = S3Client.builder()
                .region(Region.US_EAST_1)
               // .credentialsProvider(ProfileCredentialsProvider.create("default"))
                .build();

        final ListBucketsResponse listBucketsResponse = s3Client.listBuckets(ListBucketsRequest.builder().build());
        final List<Bucket> buckets = listBucketsResponse.buckets();
        buckets.forEach(System.out::println);
    }
}

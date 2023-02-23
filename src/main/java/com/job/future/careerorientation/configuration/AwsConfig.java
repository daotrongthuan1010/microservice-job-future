/**
 * @author ThuanDao
 */
package com.job.future.careerorientation.configuration;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;


@Configuration
@RequiredArgsConstructor
public class AwsConfig {

//  private AmazonS3 amazonS3;
//
//  @Value("${aws.region}")
//  private final String awsRegion;
//
//  @Value("${aws.accessKey}")
//  private final String accessKeyEncoded;
//
//  @Value("${aws.secretKey}")
//  private final String secretKeyEncoded;



//  @Bean
//  public BasicAWSCredentials basicAWSCredentials(){
//   String awsAccessKey = new String(Base64.getDecoder().decode(accessKeyEncoded));
//   String awsSecretKey = new String(Base64.getDecoder().decode(secretKeyEncoded));
//    return new BasicAWSCredentials(awsAccessKey, awsSecretKey);
//  }


//  @Bean
//  public AmazonS3 amazonS3() {
//    AmazonS3 amazonS3 = AmazonS3ClientBuilder.standard()
//        .withRegion(Regions.fromName(awsRegion))
//        .withCredentials(new AWSStaticCredentialsProvider(basicAWSCredentials()))
//        .build();
//    return amazonS3;
//  }


//  public void createBucket(String bucketName) {
//    if (!amazonS3.doesBucketExistV2(bucketName)) {
//      amazonS3.createBucket(bucketName);
//    }
//  }

}

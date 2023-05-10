package com.informatica;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.storage.Bucket;
import com.google.cloud.storage.BucketInfo;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;

public class Sharepoint {
public static void main(String[] arg) throws IOException {
	
	String credentialsJson = "{\"type\": \"service_account\", \"project_id\": \"gcscloud\","
			+ "\"service_account_key\":\"-----BEGIN PRIVATE KEY-----\\nMIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQC54jStqX4QZxcS\\nSm0aROXfZegcMZ7Z2immFUNPDwg1r+An63Ov6NL3YraYi+WPhmGRoyrFrW5qE/Wt\\nFzhZDJwj6tbidf7vJglVVBJcdUlji6YHz2DY0Tv6uIry87ovsJKweo96yJH5mlkT\\nvbPO4JnaOYpbzB29BSPyXTSwWvI9Vn5uPoVIXqJT7luLtLGIYmFXwAZ/dlRj5qJw\\nIFv7XAvNLd0+5m/Gu/hWqUuvF96G1dh82WNmfYxV4Fng+MUW0zZcPg/1IMKLWdIz\\n+Br1Mub6quBqlgT7AXntZ8mBByPpaZ+hxP/0+xMW+j7+mBw8J8U4yJqgrTHvsgtA\\nARf0jSRhAgMBAAECggEABFOpIT+4QP59UX4tAvcGmMgg+oMHLRAAdy64hd8WNFW3\\nNIatBzO2sW55TJy5B7m7jK3NIZPTZaG4TsKjG6OJAOcHAHd5qyxp/DP8R22teyU1\\nhKoFmZZpPIFOLrCQrWqBR51auKNxjmtS1nxMcqzUt/kt6MwcBxnXB922i8JaMCZI\\nlozAaLTKAIxkT1faaLrASABT+7FCYL7/BYtDA8GP7pu1f/pNGcuds+Ne1mqSnR6k\\n6yDxNf8TctXWSPAA53Yxq78EYgDVx8rY6oslSK1mp64iiuok2MvPIzRpvAXAePvn\\nBWtEltPlOfV7cs75OzrVxc5esGEf+TpHwgEKpvqzrwKBgQDpI3iowhbSABP6MpY4\\n5vUbAasf1Nj7MWYzv7k61flgRKnlD8sw9IFStYkFf3xCvvG+gd6wUkxIMQYNmX6i\\nv0T8YhZGMbDvA3O+YYksbYh/jJYof+x2YzxXZ3NE/nlABkgFcU8BiXNjsu4AH5Hp\\nQCgNniEEnu+djP9IDB8eogHyswKBgQDMHHux0q+9TtYf8fhVy5rrFktGfBbq8VO/\\nvIWT7X2SlZTRDVNIM9xAhVcyAAw04O+XH6uEsEuJzTS6vRDxArWOe0GxmEWoTCK1\\nBod2Jzm+w3MTiOEktl6yFe5Rltyt+rrmPSqPZSfathLjyIzc8hY0LqR7c0w+/jgX\\n0Sht8xUGmwKBgBpVymxtuDwyjA8oJbX5yNgrIRRwa648T0orLxZJU2kfeH2Kgi5e\\ngDlCjl7Tnsq/XPljHC+YrEs/Vmq02wwxRO6pedCmDlGBd1KbG+6r1M5rqA6dHK3m\\n2csZwXiaskGcNAiBWyZWS3WIob/b0RSjDaM0KJCoD3MhmTifPeis7kFnAoGAbxkx\\n2uCq94fp1QmH+msQr9U6s+rnLoqc40hiDNq/9wGkNwXhxvMzd4scowKTolStFL0Q\\nRvEOrLsdcGdoyUaIPD2qzFft0mVentom8ZD4RXVtNbzTj4AUmyqExbQv+iL3iErS\\n16pfvxRLw+Bti/XZUB3zOZ7QaZlGPvCB6Rbe4vECgYEA3ATyjY69nDRO4zWtvIT2\\nbttXIPHbzA2Redc3imaXJGptDiX4MMxrtgRSIr6WxeQYnkKe+5CXB9Voj5pavTjF\\n3RhBbkJp6EKAiNWGgOap3en0oJGynP2lOuAqLNEfp0Tfbvar5P6mzegU9vpsqokg\\nr3mzGdBz93aN0Lzmg52tWig=\\n-----END PRIVATE KEY-----\\n\","
			+ "\"username\":\"connectorsinfa01@gmail.com\",\"password\":\"infa@1234\",\"private_key\":\"gs://gcs_storage\","
			+ "\"private_key_id\":\"979d39b349ee1fa9dae34aedfdadd06ae2f492b7\",\"\"client_email\":\"generated-by-kk@gcscloud.iam.gserviceaccount.com\",\"\"client_id\":\"106746368472598206927\"}";
    GoogleCredentials credentials = GoogleCredentials.fromStream(new ByteArrayInputStream(credentialsJson.getBytes(StandardCharsets.UTF_8)));

    // Create a Storage object using the provided credentials
    Storage storage = StorageOptions.newBuilder().setCredentials(credentials).build().getService();

    // The name for the new bucket
    //String bucketName = "infagcs"; // "my-new-bucket";

    // Creates the new bucket
  //  Bucket bucket = storage.create(BucketInfo.of(bucketName));

    //System.out.printf("Bucket %s created.%n", bucket.getName());
    
    System.out.println("My buckets:");
    for (Bucket bucket : storage.list().iterateAll()) {
      System.out.println(bucket);
}
}
}

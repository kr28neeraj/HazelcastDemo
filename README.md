# HazelcastDemo

## Motivation
Create a Spring Boot project with Hazelcast as in-memory distributed cache.

### My Slack community for hazelcast

https://app.slack.com/client/T01331THEQL/C015Q2TUBKL


## Version 
SpringBoot : 2.5.1
Java : 1.8
Hazlecast : 4.1

#### Start 3 Node hazelcast cluster in local machine.
- Download the hazelcast 4.1 Jar from https://hazelcast.org/imdg/download/archives/#hazelcast-imdg
- Navigate to the hazelcast-4.1\demo folder and run the start.sh script.
- Repeat the running of start.sh two more time to start 3 Node cluster in same machine.If everything successfull we can see the below logs in the start up console

<p>
Jun 14, 2021 11:56:42 AM com.hazelcast.internal.cluster.ClusterService <br>
INFO: [192.168.0.111]:5703 [dev] [4.1] <br>
        
 <br>

Members {size:3, ver:5} [
        Member [192.168.0.111]:5701 - 14108933-f528-4b76-9fc1-2e980ef54e6e
        Member [192.168.0.111]:5702 - 3876836e-a22b-4a35-8e0d-1643a1fbff4f
        Member [192.168.0.111]:5703 - 14390389-c8ed-4a88-a10e-0d2eec1cbc36 this
]

 <br>
Jun 14, 2021 11:56:43 AM com.hazelcast.core.LifecycleService





# Terminal Health Record Index Library (thri)
## Intro

The current release of the library contains all the operations that are needed from the side of the HCP application developer to interact with the library and finally with the Health Record Index. This library contains different operations that have to be invoked regarding the HCP application. This library is a Java-based component that can be embedded in any Java based application. `t-hri` is a java library implemented to be used by HCP-App developers in order to call the HRI request regarding the Healthcare Practitioners. This library is offered in the context of  **InteropEHRate** project.

## Methods 

### getCloud
By using this method, a request is submitted to the Health Record Index service. This method is used by the HCP app in order to retrieve a citizen’s information from the HR Index by using his/her ID. The request is performed to the following endpoint of the deployed HR Index service. 

- Endpoint: http://[URL]:8080/hcp/getCloud
- Parameters as headers: ***citizenId, hriEmergencyToken***  

This response includes the following attributes:
- msg: A message containing the status of the request
- cloudUri: The cloud uri the citizen stores his/ her EHR
- citizenId: The unique ID of the citizen
- citizenUsername: The username used by the citizen
- hriAuthToken: The JWT token used for the validation
- status: The request status


```json
{
    "msg": "Citizen found",
    "data": [
        {
            "cloudUri": "$cloudUri",
            "citizenId": "$citizenId",
            "citizenUsername": "$citizenUsername"
        }
    ],
    "hriAuthToken": "$hriEmergencyToken"
    "status": 200
}
```

## Setup guide
To use thri, the latest version of the library must be downloaded from Nexus repository and then an object should be created and used inside the application.
The library's latest version is 0.0.5

# sample-token-broker
This repo will consist of
- Token Client Application
- Token Service
- Token Broker to inject token service user credentials into the token client application when bound to it.

The goal is to showcase how easy it is to build a broker around an existing service for apps to consume. For demo purpose, the service broker will create a set of credentials on every bind-service call which the application can use to access the service REST endpoint. 


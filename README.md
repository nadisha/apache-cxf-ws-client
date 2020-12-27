# apache-cxf-ws-client
Access the web services which are exposes by apache-cxf-ws-provider project

To generate stubs to access the web service operations use wsimport tool
wsimport -keep <WSDL file location>

Ex: wsimport -keep http://localhost:8080/apache-cxf-provider/web-services/calc?wsdl

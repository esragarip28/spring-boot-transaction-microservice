#Transaction Microservice
#Endpoints

###save transaction:localhost:8081/api/transaction
````
POST /api/transaction HTTP/1.1
Host: localhost:8081
Authorization: Basic base64(username:password)
Content-Type: application/json
Cookie: JSESSIONID=BCC28CF985E23E15DCFAA1BFD33892D5
Content-Length: 40

{
    "userId":1,
    "productId":2
}
````

###get transaction : localhost:8081/api/transaction/1
````
GET /api/transaction/1 HTTP/1.1
Host: localhost:8081
Authorization: Basic base64(username:password)
Content-Type: application/json
Cookie: JSESSIONID=BCC28CF985E23E15DCFAA1BFD33892D5
Content-Length: 40

{
    "userId":1,
    "productId":2
}
````
###delete transaction: localhost:8081/api/transaction/1
````
DELETE /api/transaction/1 HTTP/1.1
Host: localhost:8081
Authorization: Basic base64(username:password)
Content-Type: application/json
Cookie: JSESSIONID=BCC28CF985E23E15DCFAA1BFD33892D5
Content-Length: 40

{
    "userId":1,
    "productId":2
}````
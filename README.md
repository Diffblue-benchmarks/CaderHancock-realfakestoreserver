# Real Fake Store Server

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/217d14a6e7f74e8fa1b208990d1a4529)](https://www.codacy.com/manual/CaderHancock/realfakestoreserver?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=CaderHancock/realfakestoreserver&amp;utm_campaign=Badge_Grade)

A Spring Boot REST API Portfolio Project

Currently the controller package doesn't have much external functionality (Soon)

Eventually, I would like to write a pure kotlin android client to boogie with the backend, but for now I'm focusing on the M and C, V can come later.


Requires JDK 11

To build and launch, run build.sh in the project root. 

Things to checkout: 

GET

/api/products/search/{caseInsensitiveString}
             
/api/products/all/
            
/api/products/findByProductId/{int}

/api/customers/addToCart/{customerId}/{productId}/{quantity}

/api/customers/findByCustomerId/{int}

/api/customers/checkout/{int customerId}

POST 
       
 /api/products/{product json}
 
 /api/customers/{customer json}

    


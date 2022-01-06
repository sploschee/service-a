# service-a

## Table of Contents
* [Ownership](#owner)
* [Description](#Description)
* [Installation](#Installation)
* [Usage](#Usage)
* [Dependencies](#Dependencies)
* [Issues](#Issues)
* [ToDo](#ToDo)


### Owner
Leena Mooneeram

### Description

service-a polls the [coinbase prices endpoint](https://developers.coinbase.com/docs/wallet/guides/price-data) every minute to obtain the bitcoin value in USD and displays the retrieved value.

### Installation

Build & Run Spring-Boot service using 

`mvn clean package && mvn spring-boot:run`

### Usage
To view values retreived, navigate http://localhost:8080/

### Dependencies
Developed locally using Spring-Boot, Docker Desktop & Kind

### Issues
1.  Ingress Config
2.
3.

### ToDo
1. Parameterise Asset, value currency and poll frequency
2. Tests
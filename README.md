Application intégrant Spring Boot et Akka :

* Timer in our <b>Poller Actor</b> emits a tick each three seconds

* Poller begins ticking when created

* On each tick, sends a message to the <b>PriceRequestor Actor</b>
containing the name of the crypto currency

* <b>PriceRequestor Actor</b> makes a REST API call using the
Coinbase service

* A message is sent to the <b>Printer Actor</b>

* <b>Printer Actor</b> subscribes to the Mono response and passes
in a lambda to print out the formatted information after the
REST API call complete

* Process repeats every three seconds while the <b>Poller Actor</b>
is active
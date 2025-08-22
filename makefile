default: run

run:
	./gradlew runClient

server:
	./gradlew runServer


.PHONY: default run server

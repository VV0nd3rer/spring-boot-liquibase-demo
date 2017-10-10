# spring-boot-liquibase-demo
1. Generate a changeLog from an existing Database (Reverse engineering) with a Maven Plugin
  mvn liquibase:generateChangeLog
2. Synchronize metadata. Create tables that liquibase uses for handling the versions
  mvn liquibase:changeLogSync
3. Run command update to apply the change set
  mvn liquibase:update

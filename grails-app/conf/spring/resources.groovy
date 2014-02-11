// Place your Spring DSL code here
beans = {
    jndi(org.springframework.jndi.JndiTemplate){
       environment = [
         "java.naming.factory.initial" : "org.jnp.interfaces.NamingContextFactory",
         "java.naming.provider.url" : "jnp://localhost:21099"
       ]
   }
}

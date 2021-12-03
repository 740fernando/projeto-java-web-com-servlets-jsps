
      
 <h1>JAVA EE </h1>

<p>As aplicações Web de hoje em dia já possuem regras de negócio bastante complicadas. Codificar essas muitas regras já representam um grande trabalho. Além dessas regras, 
conhecidas como requisitos funcionais de uma aplicação, existem outros requisitos que precisam ser atingidos através da nossa infraestrutura: persistência em banco de dados, 
transação, acesso remoto, web services, gerenciamento de threads, gerenciamento de conexões HTTP, cache de objetos, gerenciamento da sessão web, balanceamento de carga, 
entre outros. São chamados de <strong>requisitos não-funcionais</strong>.</p>
<p>Se formos também os responsáveis por escrever código que trate desses outros requisitos, teríamos muito mais trabalho a fazer. Tendo isso em vista, a Sun criou uma série
de especificações que, quando implementadas, podem ser usadas por desenvolvedores para tirar proveito e reutilizar toda essa infraestrutura já pronta.<p>
<p>O Java EE (Java Enterprise Edition) consiste de uma série de especificações bem detalhadas, dando uma receita de como deve ser implementado um software
que faz cada um desses serviços de infraestrutura.</p>
<p>Porque a Sun faz isso? A ideia é que você possa criar uma aplicação que utilize esses serviços. Como esses serviços são bem complicados, você não perderá
tempo implementando essa parte do sistema. Existem implementações tanto open source quanto pagas, ambas de boa qualidade.</p>

<h2>Especificações do Java EE</h2>
<p>As APIs a seguir são as principais dentre as disponibilizadas pelo Java Enterprise: </p>

- JavaServer Pages (JSP), Java Servlets, Java Server Faces (JSF) (trabalhar para a Web)

- Enterprise Javabeans Components (EJB) e Java Persistence API (JPA). (objetos distribuídos, clusters, acesso remoto a objetos etc)

- Java API for XML Web Services (JAX-WS), Java API for XML Binding (JAX-B) (trabalhar com arquivos xml e webservices)

- Java Autenthication and Authorization Service (JAAS) (API padrão do Java para segurança)

- Java Transaction API (JTA) (controle de transação no contêiner)

- Java Message Service (JMS) (troca de mensagens assíncronas)

- Java Naming and Directory Interface (JNDI) (espaço de nomes e objetos)

- Java Management Extensions (JMX) (administração da sua aplicação e estatísticas sobre a mesma)

<h2>Servidor de Aplicação</h2>
<p>O Java EE é um grande conjunto de especificações. Essas especificações, quando implementadas, vão auxiliar bastante o desenvolvimento da sua aplicação, 
pois você não precisará se preocupar com grande parte de código de infraestrutura, que demandaria muito trabalho.</p>
<p>Como fazer o "download do Java EE"? O Java EE é apenas um grande PDF, uma especificação, detalhando quais especificações fazem parte deste. 
Para usarmos o software, é necessário fazer o download de uma implementação dessas especificações.</p>
<p>Como fazer o "download do Java EE"? O Java EE é apenas um grande PDF, uma especificação, detalhando quais especificações fazem parte deste. 
Para usarmos o software, é necessário fazer o download de uma implementação dessas especificações.</p>
<p>Existem diversos servidores de aplicação famosos compatíveis com a especificação do J2EE 1.4, Java EE 5 e alguns já do Java EE 6. O JBoss é um dos líderes
do mercado e tem a vantagem de ser gratuito e open source. Alguns softwares implementam apenas uma parte dessas especificações do Java EE, como o Apache Tomcat,
que só implementa JSP e Servlets (como dissemos, duas das principais especificações), portanto não é totalmente correto chamá-lo de servidor de aplicação.
A partir do Java EE 6, existe o termo "application server web profile", para poder se referenciar a servidores que não oferecem tudo, mas um grupo menor de 
especificações, consideradas essenciais para o desenvolvimento web.</p>
<p>Alguns dos servidores de aplicação mais conhecidos do mercado: </p>

- Oracle/Sun, GlassFish Server Open Source Edition 4.0, gratuito, Java EE 7;
- RedHat, JBoss Application Server 7.x, gratuito, Java EE 6;
- Apache, Apache Geronimo, gratuito, Java EE 6 (não certificado);
- Oracle/BEA, Oracle WebLogic Server 8.x, Java EE 6;
- IBM, IBM WebSphere Application Server, Java EE 6;
- SAP, SAP NetWeaver Application Server ou SAP Web Application Server, Java EE 6 Web Profile;



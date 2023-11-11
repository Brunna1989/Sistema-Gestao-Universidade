**_Projeto de Gerenciamento Universitário:_**

_Este projeto é uma aplicação Spring Boot que oferece um sistema de gerenciamento universitáro.
Ele se conecta a um banco de dados PostgreSQL usando Spring JDBC e contâiner Docker, expondo endpoints para cadastrar e listar
Cursos, Disciplinas, Alunos e Professores. Além disso, permite matricular alunos em disciplinas, atribuir e listar notas
e também a verificação de disciplinas lecionadas por cada professor._

**_Tecnologias Utilizadas:_**

    JDK 17
    Spring Boot: Framework para criar aplicações Web's.
    Gradle: Gerenciador de pacotes.
    Docker: Plataforma para desenvolvimento, envio e execução de aplicativos em contêineres.
    JUnit 5: Framework de testes unitários.
    PostgreSQL: Sistema de gerenciamento de banco de dados relacional.

**_Funcionalidades:_**

    Cadastrar e Listar Cursos, Disciplinas, Alunos e Professores:
        Utilize os endpoints fornecidos para cadastrar e listar Cursos, Disciplinas, Alunos e Professores. Consulte a documentação do Swagger para detalhes sobre os endpoints e os dados necessários.

    Relacionamentos Disciplina-Curso e Professor-Disciplina:
        Ao cadastrar uma disciplina, informe a qual curso ela pertence.
        Ao cadastrar um professor, especifique qual disciplina ele leciona.

    Matricular Alunos em Disciplinas:
        Utilize o endpoint para matricular um aluno em uma disciplina, fornecendo os dados necessários.

    Atribuir Notas:
        Atribua notas a alunos em determinadas disciplinas usando o endpoint correspondente.

    Listar Notas dos Alunos por Disciplina:
        Utilize o endpoint para listar as notas dos alunos em cada disciplina.

**_Docker Compose:_**

_O arquivo docker-compose.yml é utilizado para orquestrar os contêineres
Docker necessários para a execução do projeto. Ele define os serviços para
o banco de dados PostgreSQL, o pgAdmin (interface web para gerenciamento do PostgreSQL)
e a aplicação Spring Boot._

    db: Serviço para o banco de dados PostgreSQL, configurado com usuário, senha e banco de dados.
    pgadmin: Serviço para o pgAdmin, uma interface web para gerenciar o PostgreSQL.
    app: Serviço para a aplicação Spring Boot, configurado para se conectar ao banco de dados PostgreSQL.
    Para acessar o banco de dadsos via pgAdmin4, acesse no browser: http://localhost:15432/browser/
    Login: email123@gmail.com
    Senha: postgres


**_Executando o Projeto via Docker:_**

    Certifique-se de ter o Docker instalado e funcionando.
    No terminal, navegue para o diretório onde o docker-compose.yml está localizado.
    Execute docker-compose up para iniciar todos os serviços definidos no arquivo.

##Bootcamp System
O Bootcamp System é um sistema orientado a objetos que gerencia informações sobre cursos, mentorias e participantes em bootcamps de desenvolvimento.

##Classes
Bootcamp
A classe Bootcamp representa um bootcamp e possui os seguintes atributos:

nome (String): Nome do bootcamp.
cursos (List<Curso>): Lista de cursos oferecidos no bootcamp.
mentorias (List<Mentoria>): Lista de mentorias disponíveis no bootcamp.
participantes (List<Devs>): Lista de participantes (Devs) no bootcamp.
Além disso, a classe possui os seguintes métodos:

adicionarCurso(Curso curso): Adiciona um curso à lista de cursos.
adicionarMentoria(Mentoria mentoria): Adiciona uma mentoria à lista de mentorias.
adicionarParticipante(Devs dev): Adiciona um participante (Devs) à lista de participantes.
Curso
A classe Curso representa um curso e possui os seguintes atributos:

nome (String): Nome do curso.
descricao (String): Descrição do curso.
duracaoHoras (int): Duração do curso em horas.
Mentoria
A classe Mentoria representa uma mentoria e possui os seguintes atributos:

tema (String): Tema da mentoria.
horario (String): Horário da mentoria.
Devs
A classe Devs representa um participante (desenvolvedor) e possui os seguintes atributos:

nome (String): Nome do participante.
nivel (String): Nível de experiência do participante.
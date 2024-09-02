class Aluno:
    def __init__(self, nome, idade):

        """
        Construtor - Inicializa uma nova instância da classe Aluno.

        :param nome (str): O nome do aluno.
        :param idade (int): A idade do aluno.
        """
        self.nome = nome
        self.idade = idade

    def get_nome(self):
        return self.nome

    def set_nome(self, nome):
        self.nome = nome

    def get_idade(self):
        return self.idade

    def set_idade(self, idade):
        self.idade = idade

    def __str__(self):
        """
        Retorna uma representação em string da instância da classe Aluno.

        :return: Uma string formatada com o nome e a idade do Aluno.
        """
        return f"Aluno [ nome={self.nome}, idade={self.idade} ]"

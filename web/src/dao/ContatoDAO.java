package dao;

import connection.Conn;
import domain.Contato;

import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ContatoDAO {
    private Connection connection;
    private static ContatoDAO contatoDAO;

    public ContatoDAO() {
        this.connection = Conn.getConnection();
    }

    public void add(Contato contato) {
        String sql = "insert into contatos (nome, email, endereco, dataNascimento) values (?,?,?,?)";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, contato.getNome());
            statement.setString(2, contato.getEmail());
            statement.setString(3, contato.getEndereco());
            statement.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));

            statement.execute();
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Contato> getAllContatos() throws SQLException {
        PreparedStatement statement = connection.prepareStatement("select * from contatos");
        ResultSet resultSet = statement.executeQuery();

        List<Contato> contatos = new ArrayList<>();

        while (resultSet.next()) {
            Contato aux = new Contato();

            aux.setId(resultSet.getLong("id"));
            aux.setNome(resultSet.getString("nome"));
            aux.setEmail(resultSet.getString("email"));
            aux.setEndereco(resultSet.getString("endereco"));

            Calendar data = Calendar.getInstance();
            data.setTime(resultSet.getDate("dataNascimento"));
            aux.setDataNascimento(data);

            contatos.add(aux);
        }

        resultSet.close();
        statement.close();

        return contatos;
    }

    public void delete(Long id) {
        try {
            PreparedStatement stmt = connection.prepareStatement("delete from contatos where id=?");
            stmt.setLong(1, id);
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void update(Contato contato) {
        String sql = "update contatos set nome=?, email=?, endereco=?, dataNascimento=? where id=?";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, contato.getNome());
            stmt.setString(2, contato.getEmail());
            stmt.setString(3, contato.getEndereco());
            stmt.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));
            stmt.setLong(5, contato.getId());

            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

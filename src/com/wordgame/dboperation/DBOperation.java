package com.wordgame.dboperation;

import com.mysql.jdbc.Driver;
import com.wordgame.model.SelectedWord;
import com.wordgame.model.Simvol;
import com.wordgame.model.Word;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBOperation {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    

    private void connect() {

        try {
            DriverManager.registerDriver(new Driver());
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/wordgame", "root", "mysqlramin");
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void close() {

        try {
            if (!conn.isClosed()) {
                conn.close();

            }
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void AddSimvol(Simvol simvol) {

        connect();
        try {
            ps = conn.prepareStatement("insert into simvol values(0,?,?,?,?,?,?,?,?)");
            ps.setString(1, simvol.getSimvol1());
            ps.setString(2, simvol.getSimvol2());
            ps.setString(3, simvol.getSimvol3());
            ps.setString(4, simvol.getSimvol4());
            ps.setString(5, simvol.getSimvol5());
            ps.setString(6, simvol.getSimvol6());
            ps.setString(7, simvol.getSimvol7());
            ps.setString(8, simvol.getSimvol8());

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
    }


    public HashSet<Simvol> EightSimvolById(int id) {
        HashSet<Simvol> set = new HashSet();
        connect();
        try {
            ps = conn.prepareStatement("select * from simvol where id=" + id + " ");
            rs = ps.executeQuery();
            while (rs.next()) {
                Simvol s = new Simvol();
                s.setId(rs.getInt("id"));
                s.setSimvol1(rs.getString("simvol1"));
                s.setSimvol2(rs.getString("simvol2"));
                s.setSimvol3(rs.getString("simvol3"));
                s.setSimvol4(rs.getString("simvol4"));
                s.setSimvol5(rs.getString("simvol5"));
                s.setSimvol6(rs.getString("simvol6"));
                s.setSimvol7(rs.getString("simvol7"));
                s.setSimvol8(rs.getString("simvol8"));
                set.add(s);

            }
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
        return set;

    }

    public void AddWord(Word word) {

        connect();
        try {
            ps = conn.prepareStatement("insert into word values(0,?)");
            ps.setString(1, word.getWord());

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
    }

    public List<Word> AllWord() {
        List<Word> words = new ArrayList();
        connect();
        try {
            ps = conn.prepareStatement("select * from word");
            rs = ps.executeQuery();
            while (rs.next()) {
                Word w = new Word();
                w.setId(rs.getInt("id"));
                w.setWord(rs.getString("w"));

                words.add(w);

            }
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
        return words;

    }

    public void AddSelectedWord(SelectedWord word) {

        connect();
        try {
            ps = conn.prepareStatement("insert into selected_word values(0,?)");
            ps.setString(1, word.getSelectedWord());

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
    }

    public List<SelectedWord> SelectedWord() {
        List<SelectedWord> words = new ArrayList();
        connect();
        try {
            ps = conn.prepareStatement("select * from selected_word ");
            rs = ps.executeQuery();
            while (rs.next()) {
                SelectedWord w = new SelectedWord();
                w.setId(rs.getInt("id"));
                w.setSelectedWord(rs.getString("selected_word"));

                words.add(w);

            }
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
        return words;

    }
    
        public void deleteSelectedWord() {

        connect();
        try {
            ps = conn.prepareStatement("DELETE FROM selected_word where id > 0");
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBOperation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
    }
        
}

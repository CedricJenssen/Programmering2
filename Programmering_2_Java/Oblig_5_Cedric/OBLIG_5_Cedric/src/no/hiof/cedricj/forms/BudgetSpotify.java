package no.hiof.cedricj.forms;

import no.hiof.cedricj.models.Album;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BudgetSpotify extends JFrame {

    private JPanel mainPanel;
    private JTextField albumNameField;
    private JTextField artistNameField;
    private JButton addAlbumButton;
    private JList<Album> AlbumsJList;
    private JTextField genreField;
    private JButton editAlbumButton;
    private JButton deleteAlbumButton;

    private DefaultListModel<Album> AlbumListModel = new DefaultListModel<>();

    public BudgetSpotify(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        this.setSize(300, 300);

        AlbumsJList.setModel(AlbumListModel);

        addAlbumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String albumName = albumNameField.getText();
                String artistName = artistNameField.getText();
                String genreName = genreField.getText();

                Album createdAlbum = new Album(albumName, artistName, genreName);

                AlbumListModel.addElement(createdAlbum);
            }
        });
        editAlbumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String albumName = albumNameField.getText();
                    String artistName = artistNameField.getText();
                    String genreName = genreField.getText();

                    Album selectedAlbum = (Album) AlbumsJList.getSelectedValue();
                    selectedAlbum.setAlbumName(albumName);
                    selectedAlbum.setArtistName(artistName);
                    selectedAlbum.setGenreName(genreName);

                    AlbumsJList.updateUI();
                }

                catch (NullPointerException nullPointerException) {
                    System.out.println("No album selected.");
                }
            }
        });
        deleteAlbumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int selectedIndex = AlbumsJList.getSelectedIndex();

                    AlbumListModel.remove(selectedIndex);

                    AlbumsJList.updateUI();
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException) {

                    System.out.println("Selected album does not exist.");
                }
            }
        });

    }
}

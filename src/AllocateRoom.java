import javax.swing.*;

public class AllocateRoom extends JFrame {
    private JLabel topHeader;
    private JButton btn_AllocateRoom;
    private JButton btn_ViewRooms;
    private JButton btn_AddNewRoom;
    private JButton btn_TerminateAllocation;
    private JButton generateFeeButton;
    private JButton reserveRoomButton;
    private JPanel RoomAllocationMenu;
    private JPanel header;

    public AllocateRoom() {
        JFrame frame = new JFrame("AllocateRoom");
        setTitle("Allocate Room");
        //set the size of frame to the maximum size of the screen
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setContentPane(RoomAllocationMenu);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        //set font size of the header to 30
        topHeader.setFont(topHeader.getFont().deriveFont(30.0f));
        //set background color of header to dark grey
        header.setBackground(new java.awt.Color(51, 51, 51));
        //set background color of the rest of the frame to light grey
        RoomAllocationMenu.setBackground(new java.awt.Color(204, 204, 204));
        //set font size of the buttons to 30
        btn_AllocateRoom.setFont(btn_AllocateRoom.getFont().deriveFont(30.0f));

    }

    public static void main(String[] args) {
        AllocateRoom dialog = new AllocateRoom();
    }
}
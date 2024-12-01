public class Main {
    public static void main(String[] args) {
        User user = new User("JohnDoe", "password123");

        // mengakses method public untuk mencetak informasi user
        user.displayUserInfo();

        // mengakses method public untuk memperbarui password
        user.updatePassword("newPassword123");

        // Menampilkan informasi pengguna setelah password diperbarui
        user.displayUserInfo();
    }
}

class User {
    // Private hanya dapat diakses di dalam class ini
    private String username;
    private String password;

    // Constructor public agar dapat diakses oleh class lain
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Public method untuk menampilkan informasi pengguna
    public void displayUserInfo() {
        System.out.println("Username: " + username);
        System.out.println("Password: (hidden)");
    }

    // Public method untuk memperbarui password
    public void updatePassword(String newPassword) {
        if (isPasswordValid(newPassword)) {
            this.password = newPassword;
            System.out.println("Password berhasil diperbarui!");
        } else {
            System.out.println("Password baru tidak valid!");
        }
    }

    // Private method hanya dapat diakses oleh class ini
    private boolean isPasswordValid(String password) {
        // Validasi password simpel saja minimal 8 karakter
        return password.length() >= 8;
    }
}

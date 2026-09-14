import java.util.ArrayList;
import java.util.List;

// 1. صنف العميل
class Client {
    int id;
    String name;
    String phone;

    public Client(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }
}

// 2. صنف المعاملة المالية
class Transaction {
    int id;
    String clientName;
    String title;
    double amount;
    String status;

    public Transaction(int id, String clientName, String title, double amount, String status) {
        this.id = id;
        this.clientName = clientName;
        this.title = title;
        this.amount = amount;
        this.status = status;
    }
}

// 3. الصنف الرئيسي للبرنامج
public class Main {
    public static void main(String[] args) {
        List<Transaction> transactions = new ArrayList<>();

        // إضافة بيانات تجريبية
        transactions.add(new Transaction(1, "مؤسسة الأمل", "تطوير لوحة تحكم", 400.00, "completed"));
        transactions.add(new Transaction(2, "شركة السلام", "إصلاح قواعد بيانات", 250.00, "pending"));

        double totalRevenue = 0.0;
        int pendingCount = 0;

        System.out.println("=== نظام إدارة البيانات الداخلي (Java) ===");
        System.out.println("----------------------------------------");

        for (Transaction t : transactions) {
            System.out.println("العميل: " + t.clientName + " | الخدمة: " + t.title + " | المبلغ: $" + t.amount + " | الحالة: " + t.status);
            
            if (t.status.equals("completed")) {
                totalRevenue += t.amount;
            } else if (t.status.equals("pending")) {
                pendingCount++;
            }
        }

        System.out.println("----------------------------------------");
        System.out.println("إجمالي الإيرادات المكتملة: $" + totalRevenue);
        System.out.println("عدد المعاملات المعلقة: " + pendingCount);
    }
}

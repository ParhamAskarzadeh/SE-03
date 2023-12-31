**گزارش مختصری از مراحل انجام آزمایش**

در این آزمایش، ابتدا یک کلاس `Rectangle` برای محاسبه‌ی مساحت مستطیل با استفاده از متد `computeArea()` ایجاد کردیم. سپس، یک تست واحد برای این متد نوشتیم که مساحت یک مستطیل با طول 10 و عرض 5 را بررسی می‌کند. در ادامه، کد کلاس `Rectangle` را اصلاح کردیم تا تست پاس شود. در نهایت، دو تست دیگر برای بررسی مساحت مستطیل با طول 0 و عرض 0 و مساحت مستطیل با طول منفی و عرض مثبت اضافه کردیم.

**پاسخ پرسش‌ها**

**پرسش 1**

خیر، این دو مورد با هم تناقضی ندارند. در چرخه‌ی عمومی ایجاد نرم‌افزار، آزمون نرم‌افزار برای اطمینان از صحت عملکرد نرم‌افزار انجام می‌شود. در روش TDD، آزمون نرم‌افزار برای هدایت فرآیند توسعه‌ی نرم‌افزار استفاده می‌شود. در واقع، در روش TDD، آزمون نرم‌افزار به عنوان یک سند فنی برای تعیین نیازمندی‌های نرم‌افزار در نظر گرفته می‌شود.

**پرسش 2**

آزمون‌ها را می‌توان بر اساس ریزدانگی یا درشت‌دانگی تقسیم‌بندی کرد. آزمون‌های ریزدانه، آزمون‌هایی هستند که یک واحد کوچک از نرم‌افزار را بررسی می‌کنند. به عنوان مثال، یک تست واحد برای بررسی صحت عملکرد متد `computeArea()` در کلاس `Rectangle` یک آزمون ریزدانه است. آزمون‌های درشت‌دانگ، آزمون‌هایی هستند که چندین واحد از نرم‌افزار را بررسی می‌کنند. به عنوان مثال، یک تست یکپارچه‌سازی برای بررسی تعامل بین کلاس‌های `Rectangle` و `Square` یک آزمون درشت‌دانگ است.

**پرسش 3**

خیر، همه‌ی انواع آزمون‌های نرم‌افزار را برنامه‌نویسان ایجاد نمی‌کنند. برخی از انواع آزمون‌های نرم‌افزار مانند آزمون‌های عملکردی و آزمون‌های امنیتی را متخصصان این حوزه ایجاد می‌کنند.

**پرسش 4**

اصول SOLID در تمام گام‌های اصلی ایجاد نرم‌افزار استفاده می‌شوند. در گام تحلیل نیازمندی‌ها، برای شناسایی نیازمندی‌های نرم‌افزاری که باید رعایت شوند، از اصول SOLID استفاده می‌شود. در گام طراحی، برای طراحی نرم‌افزاری که پایدار و قابل نگهداری باشد، از اصول SOLID استفاده می‌شود. در گام پیاده‌سازی، برای پیاده‌سازی نرم‌افزاری که از اصول SOLID پیروی کند، از اصول SOLID استفاده می‌شود. در گام آزمون، برای اطمینان از اینکه نرم‌افزار از اصول SOLID پیروی می‌کند، از اصول SOLID استفاده می‌شود. در گام استقرار، برای استقرار نرم‌افزاری که از اصول SOLID پیروی کند، از اصول SOLID استفاده می‌شود.

**پرسش 5**

در این حالت، می‌توانستیم مربع را از مستطیل به ارث ببریم. زیرا، مربع یک مستطیل با ابعاد مساوی است. بنابراین، می‌توانیم کلاس `Square` را به صورت زیر از کلاس `Rectangle` ارث ببریم:

```java
public class Square extends Rectangle {

    public Square(int side) {
        super(side, side);
    }

}
```

در این حالت، کلاس `Square` از تمام ویژگی‌ها و متدهای کلاس `Rectangle` برخوردار خواهد بود. بنابراین، می‌توانیم از متد `computeArea()` برای محاسبه‌ی مساحت مربع استفاده کنیم.

با این حال، اگر در آزمایش بالا نیاز به تغییر ابعاد مستطیل داشتیم، نمی‌توانستیم مربع را از مستطیل به ارث ببریم. زیرا، در این حالت، کلاس `Square` نمی‌تواند از تمام ویژگی‌ها و متدهای کلاس `Rectangle` برخوردار باشد.
### 1. В чому полягає різниця між ключовими та зарезервованими словами?
*Різниця між ключовими та зарезервованими словами полягає в тому, що ключові слова мають спеціальне значення в мові програмування, тоді як зарезервовані слова можуть бути введені в майбутньому.*

### 2. Які примітивні типи даних Ви знаєте? Для кожного з них наведіть приклади, коли найбільш ефективно використовувати саме цей тип.
*Примітивні типи даних: byte, short, int, long, float, double, char, boolean. Наприклад, int для віку людини, float для заробітної платні, boolean для визначення чи є автівка червоною.*

### 3. Що таке знакові та беззнакові типи? До якої групи відноситься кожен з примітивних типів даних?
*Знакові типи мають знак (+ або -), беззнакові не мають. В Java всі примітивні типи, окрім char, є знаковими.*

### 4. Яке максимальне число можна записати у змінну типу short, char, int, long? 
*Максимальні числа: short - 32767, char - 65535, int - 2147483647, long - 9223372036854775807.*

### 5. Змінна типу byte може приймати значення у діапазоні -128..127. Чому цей діапазон саме такий? Чому від’ємних значень більше ніж додатних?
*Діапазон byte -128..127 тому, що byte займає 8 біт. Від’ємних значень більше на одне через представлення 0.*

### 6. Що таке система числення? Як переводити значення з однієї системи числення у іншу?
*Система числення - це спосіб представлення чисел. Можна переводити значення з однієї системи в іншу.*

### 7. Що таке «Доповняльний код»? 
*Доповняльний код - це спосіб представлення від’ємних чисел в двійковій системі.*

### 8. Пояснити результат роботи фрагмента коду.
*Код:*
1. **int a = 2_000_000_000;**
2. **int b = 2_000_000_000;**
3. **int c = a + b;**
4. **System.out.println(c);**

*Результат буде некоректний через переповнення типу int.*

### 9. Чим тип *float* відрізняється від *double*?
*Float використовує 32 біти, а double 64 біти.*

### 10. Що таке число з рухомою комою? Що таке мантиса та степінь?
*Число з рухомою комою має мантису та степінь.*

### 11. Що таке *Double.NaN*?
*Double.NaN - 'Not a Number'.*

### 12. Пояснити результат роботи фрагменту коду.
*Код:*
1. **System.out.println(Double.NaN==Double.NaN);**

Результат буде false, тому що NaN не дорівнює NaN.");

### 13. Пояснити різницю між преінкрементом та постінкрементом. Навести приклади, коли ці операції призводять до різних результатів.
*Преінкремент (++x) збільшує x перед використанням, постінкремент (x++) після.*

### 14. В чому різниця між логічною та побітовою операцією AND? Чому звичайна операція AND (&) є в обох варіантах, а її короткозамкнута версія (&&) лише тільки логічна?
*Логічна AND (&&) короткозамкнута, побітова (&) ні.*

### 15. В чому різниця між OR та XOR?
*OR - логічне 'або', XOR - виключне 'або'.*

### 16. Проаналізувати фрагмент програми. Передбачити його результат. Запустити. Пояснити.
*Код:*
1.  **boolean a = true && false | false;**
2.  **System.out.println(a = false);**
3.  **boolean b = true && false || false;**
4.  **System.out.println(b = true);**

*Результат a буде false, результат b буде true.*

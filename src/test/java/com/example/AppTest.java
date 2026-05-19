# AppTest.java
cat > src/test/java/com/example/AppTest.java << 'EOF'
package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class AppTest {
    @Test
    void testApp() {
        assertTrue(true);
    }
}
EOF

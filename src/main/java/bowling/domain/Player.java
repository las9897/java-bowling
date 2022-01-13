package bowling.domain;

import org.springframework.util.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Player {
    private static final Pattern PATTERN = Pattern.compile("^[A-Z]{3}$");
    private static final String MESSAGE_VALIDATION_NAME_SIZE = "이름은 대문자 영어 3글자이어야 합니다.";
    private final String name;

    public Player(String name) {
        validationName(name);
        this.name = name;
    }

    private void validationName(String name) {
        if (StringUtils.isEmpty(name)) {
            throw new IllegalArgumentException(MESSAGE_VALIDATION_NAME_SIZE);
        }

        Matcher matcher = PATTERN.matcher(name);
        if (!matcher.find()) {
            throw new IllegalArgumentException(MESSAGE_VALIDATION_NAME_SIZE);
        }
    }

    public String getName() {
        return name;
    }
}

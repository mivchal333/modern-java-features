package java12.indent;

public class TextBlockFormatter {
    private final int CODE_TEXT_BLoCK_INDENT = 4;

    String formatLinesToCodeBlockIndent(String code) {


        return code.indent(CODE_TEXT_BLoCK_INDENT);
    }
}

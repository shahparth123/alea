package xklusac.environment;

/**
 * Class ConfigurationHtml is used as a supporting class for the index.jsp
 * Contains the constants with the blocks of HTML code.
 * @author Gabriela Podolnikova
 */
public class ConfigurationHtml {

public static final String TABLE_START = 
        "<table>" +
        "<tr>" +
            "<th>Configuration item</th>" +
            "<th>Type</th>" +
            "<th>Values</th>" +
            "<th>Additional information</th>" +
        "</tr>";

public static final String TABLE_END = "</table>";

public static final String TABLE_START_PLUGIN =
        "<table>" +
        "<tr>" +
            "<th>Type</th>" +
            "<th>Value</th>" +
        "</tr>";
         
public static final String TABLE_START_PLUGIN_COMMON =
        "<table>" +
        "<tr>" +
            "<th></th>" +
            "<th>Type</th>" +
        "</tr>";
}
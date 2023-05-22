package com.ws.creationType.factory.FactoryMethod;


import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 王顺
 * @Date: 2023/5/5 15:19
 * @Version 1.0
 * @Description 工厂方法练习
 */
public class RuleConfigSource {

    public RuleConfig load(String ruleConfigFilePath) {
        //1.根据配置路径选择获取扩展名
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
        //2.创建相对应的工厂实例  找到相对应的工厂
        IRuleConfigParserFactory parserFactory = RuleConfigParserFactoryMap.getParserFactory(ruleConfigFileExtension);
        if (parserFactory == null) {
            throw new InvalidRuleConfigException(
                    "Rule config file format is not supported: " + ruleConfigFilePath);
        }
        //
        IRuleConfigParser parser = parserFactory.createParser();
        String configText = "";
        //从ruleConfigFilePath文件中读取配置文本到configText中
        RuleConfig ruleConfig = parser.parse(configText);
        return ruleConfig;
    }

    private String getFileExtension(String filePath) {
        //...解析文件名获取扩展名，比如rule.json，返回json
        return "json";
    }
}

//因为工厂类只包含方法，不包含成员变量，完全可以复用，
//不需要每次都创建新的工厂类对象，所以，简单工厂模式的第二种实现思路更加合适。
class RuleConfigParserFactoryMap { //工厂的工厂
    private static final Map<String, IRuleConfigParserFactory> cachedFactories = new HashMap<>();

    static {
        cachedFactories.put("json", new JsonRuleConfigParserFactory());
        cachedFactories.put("xml", new XmlRuleConfigParserFactory());
        cachedFactories.put("yaml", new YamlRuleConfigParserFactory());
        cachedFactories.put("properties", new PropertiesRuleConfigParserFactory());
    }

    public static IRuleConfigParserFactory getParserFactory(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }
        return cachedFactories.get(type.toLowerCase());
    }


}

/**
 * @Description 总工厂
 */
interface IRuleConfigParserFactory {
    IRuleConfigParser createParser();
}

class JsonRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser() {
        return new JsonRuleConfigParser();
    }
}

class XmlRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser() {
        return new XmlRuleConfigParser();
    }
}

class YamlRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser() {
        return new YamlRuleConfigParser();
    }
}

class PropertiesRuleConfigParserFactory implements IRuleConfigParserFactory {

    @Override
    public IRuleConfigParser createParser() {
        return new PropertiesRuleConfigParser();
    }
}

class RuleConfigParserFactory {
    public static IRuleConfigParser createParser(String configFormat) {
        IRuleConfigParser parser = null;
        if ("json".equalsIgnoreCase(configFormat)) {
            parser = new JsonRuleConfigParser();
        } else if ("xml".equalsIgnoreCase(configFormat)) {
            parser = new XmlRuleConfigParser();
        } else if ("yaml".equalsIgnoreCase(configFormat)) {
            parser = new YamlRuleConfigParser();
        } else if ("properties".equalsIgnoreCase(configFormat)) {
            parser = new PropertiesRuleConfigParser();
        }
        return parser;
    }
}

class RuleConfig {
    String configText;

    public RuleConfig(String configText) {
        this.configText = configText;
    }
}

class IRuleConfigParser {

    public RuleConfig parse(String configText) {
        return new RuleConfig(configText);
    }
}

class JsonRuleConfigParser extends IRuleConfigParser {

}

class PropertiesRuleConfigParser extends IRuleConfigParser {

}

class XmlRuleConfigParser extends IRuleConfigParser {

}

class YamlRuleConfigParser extends IRuleConfigParser {
}

/**
 * 自定义类型异常
 */
class InvalidRuleConfigException extends RuntimeException {
    String message;

    public InvalidRuleConfigException(String message) {
        this.message = message;
    }
}
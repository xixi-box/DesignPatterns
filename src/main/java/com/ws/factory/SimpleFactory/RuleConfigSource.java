package com.ws.factory.SimpleFactory;

/**
 * @Author: 王顺
 * @Date: 2023/5/3 10:58
 * @Version 1.0
 */
public class RuleConfigSource {

    public RuleConfig load(String ruleConfigFilePath) {
        //1.根据配置路径选择获取扩展名
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
        //2.创建相对应的工厂实例
        IRuleConfigParser parser = RuleConfigParserFactory.createParser(ruleConfigFileExtension);
        if (parser == null) {
            throw new InvalidRuleConfigException(
                    "Rule config file format is not supported: " + ruleConfigFilePath);
        }
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

/**
 * 读取配置信息
 */
class RuleConfig {
    String configText;

    public RuleConfig(String configText) {
        this.configText = configText;
    }
}

/**
 * 各个配置类的统一父类
 */
class IRuleConfigParser {

    public RuleConfig parse(String configText) {
        return new RuleConfig(configText);
    }
}

class JsonRuleConfigParser extends RuleConfigParser {

}

class PropertiesRuleConfigParser extends RuleConfigParser {

}

class XmlRuleConfigParser extends RuleConfigParser {

}

class YamlRuleConfigParser extends RuleConfigParser {
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
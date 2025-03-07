# 海报生成器 (Poster Generator)

📌 基于Java的授权海报生成工具，支持将指定文本信息绘制到模板图片上，快速生成标准化授权证书。

## 功能特性

- 🖼️ 加载自定义模板图片
- ✍️ 动态填充企业名称、授权品牌、编号、日期等字段
- 🎨 抗锯齿渲染，支持自定义字体与坐标定位
- 📁 输出为PNG格式的高清海报

## 环境要求

- JDK 8+
- Maven (可选，用于依赖管理)

## 快速开始

### 1. 克隆仓库

git clone https://github.com/CokoIya/poster-generator.git

cd poster-generator

2. 准备模板文件

    将模板图片命名为 template.png

    放置到资源目录：src/main/resources/template.png

3. 配置数据

修改 PosterGenerator.java 中的主方法变量值：

String company = "稀定（厦门）有限公司";          // 授权方

String authorizedCompany = "不白吃有限公司";      // 被授权方

// ...其他参数根据实际情况调整

4. 编译运行
   
javac -d bin src/main/java/com/poster/generator/PosterGenerator.java

java -cp bin com.poster.generator.PosterGenerator

或通过IDE直接运行 main 方法。

5. 获取结果

生成的海报将保存为项目根目录下的 poster.png。
高级配置
调整文本坐标

在 generatePoster 方法中修改 drawString 的坐标参数：

g2d.drawString(company, 220, 230);  // X=220, Y=230

自定义字体

修改字体名称、样式和大小：

Font font = new Font("宋体", Font.PLAIN, 24);  // 字体、样式、字号

注意事项

    🔠 确保系统已安装宋体，或替换为其他可用字体

    🖌️ 模板图片尺寸建议为 800x600px 以保证兼容性

    📍 坐标定位需根据模板实际布局调整

项目结构

├── src/main/java/com/poster/generator

│   └── PosterGenerator.java       # 核心生成逻辑

├── src/main/resources

│   └── template.png               # 模板文件（需手动添加）

└── poster.png                      # 生成结果（运行后自动创建）

许可证

MIT License © 2025 CokoIya
---
💡 **提示**：建议在仓库中提供默认模板示例，方便用户快速测试。可通过 `git-lfs` 管理大尺寸图片资源。

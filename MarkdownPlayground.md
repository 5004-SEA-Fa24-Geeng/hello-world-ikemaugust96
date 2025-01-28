# Markdown Playground

Use this file to add example markdown elements you learned about by reading the markdown resources below. You need to add at least 3 different markdown elements you learned about, and a mermaid class diagram (of your choice does not have to follow the assignment. However, if you did use mermaid for the assignment, you can just copy that here).

Mermaid is a markdown language that allows you to create diagrams. You can find more information about mermaid in the resources below. It has become popular enough that github has included it as an option in their markdown.  For built in markdown readers, such as the one built into IntelliJ or VSCode, you may need to install a plugin to render the mermaid diagrams.

> [!NOTE]
> [IntelliJ Mermaid Plugin](https://plugins.jetbrains.com/plugin/20146-mermaid). Also for intelliJ, this is often installed by default, but incase it isn't [Markdown Plugin IntelliJ](https://plugins.jetbrains.com/plugin/7793-markdown).

> [!NOTE]
> [VS Code Mermaid Preview](https://marketplace.visualstudio.com/items?itemName=bierner.markdown-mermaid). Markdown preview is enabled by default, but if you want the full github flavored markdown, [Github Styling Preview](https://marketplace.visualstudio.com/items?itemName=bierner.markdown-preview-github-styles) is popular.

## Markdown Resources

* [Markdown Guide](https://www.markdownguide.org/basic-syntax/)
* [Github Flavored Markdown](https://guides.github.com/features/mastering-markdown/)
* [Github Markdown Getting Started](https://docs.github.com/en/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax)
* [Mermaid Syntax Reference](https://mermaid.js.org/intro/syntax-reference.html)

<!-- start your playground code under this dashed line -->

---

1.Tables

Markdown allows you to create tables using pipes (|) and hyphens (-). This is useful for organizing data in a structured format.

2.Task Lists

You can create task lists by using hyphens (-) or asterisks (*) followed by square brackets. This is particularly useful for project management or tracking progress.

3.Blockquotes

Blockquotes are used to highlight quotes or important information. They are created by placing a greater-than symbol (>) before the text.


mermaid class diagram:


classDiagram
direction BT
class AlohaWorld {

- AlohaWorld()

+ main(String[]) void
  }
  class ConsoleView {

- ConsoleView()

+ checkRunAgain() boolean
+ printGreeting(String) void
  String name
  int locality
  }
  class Greeter {
+ Greeter(String, int)
+ Greeter(String)

- List~String~ localityList
- int locality
- String name

+ greet() String
+ equals(Object) boolean
+ greet(boolean) String
+ hashCode() int
+ toString() String
  String name
  List~String~ localityList
  int locality
  String localityString
  }

AlohaWorld  ..>  ConsoleView
AlohaWorld  ..>  Greeter : «create»
ConsoleView  ..>  ConsoleView
ConsoleView  ..>  Greeter
Greeter  ..>  Greeter

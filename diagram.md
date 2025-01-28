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

Walking through the examples related to ¨Understanding Interface Members¨ from the "OCP Oracle Certified Professional Java SE 11 Programmer II Sutdy Guide".

page 59/758

Interface member types

|                       | Since Java Version | Membership type | Required modifiers |  Implicit modifiers | Has value or body? |
|:----------------------|:------------------:|----------------:|-------------------:|--------------------:|-------------------:|
| Constant variable     |        1.0         |           Class |                  - | public static final |                Yes |
| Abstract method       |        1.0         |        Instance |                  - |     public abstract |                 No |
| Default method        |         8          |        Instance |            default |              public |                Yes |
| Static method         |         8          |           Class |             static |              public |                Yes |
| Private method        |         9          |        Instance |            private |                   - |                Yes |
| Private static method |         9          |           Class |     private static |                   - |                Yes |
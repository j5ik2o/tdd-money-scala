# TDDにおける多国籍通貨の例

[テスト駆動開発](https://amzn.to/3upuEXW)の多国籍通貨のテストをScalaで書いたものです。

## 多国籍通貨のコンテキスト

以下のようなレポート機能を実現するにはどうしたらよいか

| 銘柄       |   株数 |      価格 |        合計 |
|----------|-----:|--------:|----------:|
| IBM      | 1000 |  25 USD | 25000 USD |
| Novartis |  400 | 150 CHF | 60000 CHF |
|          |      |      総計 | 65000 USD |

| 換算元 | 換算先 | レート |
|-----|-----|-----|
| CHF | USD | 1.5 |

- 通貨の異なる2つの金額を足し、通貨間の為替レートに基づいて換算された金額を得る
- 金額(通貨単位あたりの額)に数値(通貨単位数)を掛け、金額を得る

## 実装一覧

- [第1章 仮実装](src/test/scala/money/_01_multi_currency_money)
- [第2章 明白な実装](src/test/money/_02_degenerate_objects)
- [第3章 三角測量](src/test/money/_03_equality_for_all)
- [第4章 意図を語るテスト](src/test/scala/money/_04_privacy)
- [第5章 原則をあえて破るとき](src/test/scala/money/_05_francly_speaking)
- [第6章 テスト不足に気づいたら](src/test/scala/money/_06_equality_for_all)
- [第7章 疑念をテストに翻訳する](src/test/scala/money/_07_apples_and_oranges)
- [第8章 実装を隠す](src/test/scala/money/_08_makin_money)
- [第9章 歩幅の調整](src/test/scala/money/_09_times_were_livin_in)
- [第10章 テストに聞いてみる](src/test/scala/money/_10_interesting_times)
- [第11章 不要になったら消す](src/test/scala/money/_11_the_root_of_all_evil)
- [第12章 設計とメタファー](src/test/scala/money/_12_addition_finally)
- [第13章 実装を導くテスト](src/test/scala/money/_13_make_it)
- [第14章 学習用テストと回帰テスト](src/test/scala/money/_14_change)
- [第15章 テスト任せとコンパイラ任せ](src/test/scala/money/_15_mixed_currencies)
- [第16章 将来の読み手を考えたテスト](src/test/scala/money/_16_abstraction_finally)

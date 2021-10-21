(ns hello.Macros)

(macroexpand-1 '(when true (println "hello")))
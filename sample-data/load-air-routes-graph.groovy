// You can use this file to load the air-routes graph from the Gremlin Console
//
// To execute use the console command ":load load-air-routes-graph.groovy"
//

conf = new BaseConfiguration()
conf.setProperty("gremlin.tinkergraph.vertexIdManager","LONG")
conf.setProperty("gremlin.tinkergraph.edgeIdManager","LONG")
conf.setProperty("gremlin.tinkergraph.vertexPropertyIdManager","LONG")
graph = TinkerGraph.open(conf)

// The path points to the graphml file of the air routes file
graph.io(graphml()).readGraph('/c/Users/Heidi/Dropbox/Tutorials/Practical Gremlin/graph/sample-data/air-routes.graphml')

g=graph.traversal()
:set max-iteration 1000

// this is written in the dev branch

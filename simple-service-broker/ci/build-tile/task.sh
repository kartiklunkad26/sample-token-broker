#!/bin/sh -ex

HISTORY=`ls tile-history/tile-history-*.yml`
if [ -n "${HISTORY}" ]; then
	cp ${HISTORY} tile-history.yml
fi

cd tile-repo
mkdir target
cp ../broker-jar/*.jar target/
../tile-generator-repo/bin/tile build

VERSION=`grep '^version:' tile-history.yml | sed 's/^version: //'`
HISTORY="tile-history-${VERSION}.yml"

cp product/*.pivotal ../broker-tile
cp tile-history.yml ../tile-history-new/tile-history-${VERSION}.yml